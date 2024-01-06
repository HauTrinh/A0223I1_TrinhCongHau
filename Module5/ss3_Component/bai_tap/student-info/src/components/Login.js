import { Component } from 'react';
import StudentList from './StudentList';
 
class Login extends Component{

  render () {
    return (
      <div style={{textAlign: 'center'}}>
        <div>
            <h1>Chào mừng đã login</h1>
            <StudentList/>
            <button onClick={this.props.onLogOut}>Log out</button>
        </div>
      </div>
    )
  }
}
 
export default Login;