import "bootstrap/dist/css/bootstrap.css";
import {Component} from 'react';

const students = [
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
class StudentList extends Component {
    render() {
        return(
            <div className="container" >
                <h1 style={{textAlign:"center", color:"red"}}>Students</h1>
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
                        {students.map(student =>(
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
