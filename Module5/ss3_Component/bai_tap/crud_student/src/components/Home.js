import {Component} from 'react';
import { Modal, Button } from 'react-bootstrap';

class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {
            studentList: [],
            form: { name: "", phone: "", email: "" },
            isValid: false,
            indexSelected: -1,
            showModal: false,
            deleteIndex: null
        };
      }

      checkInvalidForm = () => {
        const { name, phone, email } = this.state.form;
        const value = name && phone && email && !isNaN(phone);
        this.setState({
          isValid: value
        })
      }

      handleChange = (event) => {
        this.setState((state) => {
          const form = state.form
          form[event.target.name] = event.target.value
          return { form }
        }, () => this.checkInvalidForm())
      }
       

      
      handleSelect = (studentSelected, index) => {
        this.setState({
          form: JSON.parse(JSON.stringify(studentSelected)),
          indexSelected: index
        })
      }

      handleSubmit = () => {
        if(this.state.isValid){
          const newList = [...this.state.studentList] // tạo bản sao của studentList
          if (this.state.indexSelected > -1) {
            newList[this.state.indexSelected] = this.state.form // cập nhập mảng đối tượng[index truyền vào] Cho state.form của component
          } else {
            newList.push(this.state.form)
          }
          this.setState({
            studentList: newList,
            form: { name: "", phone: "", email: "" },
            isValid: false,
            indexSelected: -1
          });
        }else {
            alert('Please fill out all fields correctly.');
          }
      }

    handleDelete = (index) => {
        this.setState({ showModal: true, deleteIndex: index });
    }

    confirmDelete = () => {
        const newList = [...this.state.studentList];
        newList.splice(this.state.deleteIndex, 1);
        this.setState({ studentList: newList, showModal: false });
    }

    closeModal = () => {
        this.setState({ showModal: false });
    }

    
    render() {
            const { studentList, form, showModal } = this.state;
            return (
                <div className="container">
                    <h1 className="my-4">Student List</h1>
                    <form className="mb-4">
                        <div className="mb-3">
                            <label className="form-label">Name:</label>
                            <input type="text" className="form-control" name="name" value={form.name} onChange={this.handleChange} />
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Phone:</label>
                            <input type="tel" className="form-control" name="phone" value={form.phone} onChange={this.handleChange} />
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Email:</label>
                            <input type="email" className="form-control" name="email" value={form.email} onChange={this.handleChange} />
                        </div>
                        <button type="button" className="btn btn-primary" onClick={this.handleSubmit}>Submit</button>
                    </form>
                    <table className="table">
                        <thead>
                            <tr>
                                <th scope="col">Name</th>
                                <th scope="col">Phone</th>
                                <th scope="col">Email</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            {studentList.map((student, index) => (
                                <tr key={index}>
                                    <td>{student.name}</td>
                                    <td>{student.phone}</td>
                                    <td>{student.email}</td>
                                    <td>
                                        <button type="button" className="btn btn-secondary me-2" onClick={() => this.handleSelect(student, index)}>Edit</button>
                                        <button type="button" className="btn btn-danger" onClick={() => this.handleDelete(index)}>Delete</button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                    <Modal show={showModal} onHide={this.closeModal}>
                    <Modal.Header closeButton>
                        <Modal.Title>Confirm Delete</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>Are you sure you want to delete this item?</Modal.Body>
                    <Modal.Footer>
                        <Button variant="secondary" onClick={this.closeModal}>Cancel</Button>
                        <Button variant="danger" onClick={this.confirmDelete}>Delete</Button>
                    </Modal.Footer>
                    </Modal>
                </div>
            );
        }
    
}
export default Home;
