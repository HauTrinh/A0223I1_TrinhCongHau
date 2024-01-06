import "bootstrap/dist/css/bootstrap.css";
import {Component} from 'react';
class StudentList extends Component {

    constructor (props) {
        super(props);
        this.state = {
            students : [
                {   id:1,
                    name: 'Trịnh Công Hậu',
                    age: 22,
                    address: 'Quảng Nam'
                },
                {   id:2,
                    name: 'Huyền',
                    age: 22,
                    address: 'Quảng Ngãi'
                },
                {   id:3,
                    name: 'Hiếu',
                    age: 21,
                    address: 'Quảng Bình'
                },
                {   id:4,
                    name: 'Nguyên',
                    age: 19,
                    address: 'Quảng Trị'
                },
            ]        
        };
      }

    render() {
        return(
            <div className="container" >
                <h2 style={{textAlign:"center", color:"red"}}>Students</h2>
                <table className="table table-bordered border-primary">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Tên</th>
                            <th>Tuổi</th>
                            <th>Địa chỉ</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.students.map(student =>(
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.name}</td>
                                <td>{student.age}</td>
                                <td>{student.address}</td>
                            </tr>
                        ))} 
                    </tbody>             
                </table>

            </div>
        );
    }
}

export default StudentList;
