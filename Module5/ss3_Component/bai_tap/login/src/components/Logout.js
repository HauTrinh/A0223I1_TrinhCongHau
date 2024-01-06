import { Component } from "react";
import "bootstrap/dist/css/bootstrap.css";
import StudentList from "./StudentList";
class Logout extends Component{
    componentWillUnmount() {
        alert('Goodbye!!!');
      }
      
      render () {
        return (
          <div className="container d-flex flex-column align-items-center text-center">
            <StudentList/>
            <div className="form-signin mt-3">
              <button className="w-100 btn btn-lg btn-primary" type="button" onClick={this.props.onLogOut}>Log out</button>
            </div>
          </div>
        )
      }
      
  }
   
  export default Logout;