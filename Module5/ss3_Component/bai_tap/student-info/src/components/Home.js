import { Component } from 'react';
import Login from './Login';

class Home extends Component{
    constructor (props) {
      super(props);
      this.state = {
        isLoggedIn: false
      };
    }
   
    handleLogIn = () => {
      this.setState({ isLoggedIn: true })
    } // sử lý khi click button login, sẽ chuyển trạng thái thành đã đăng nhập
    // và để hiển thị component Login
   
    handleLogOut = () => {
      const confirmLogout = window.confirm('Bạn có chắc chắn muốn Log out');
      if (confirmLogout) {
        this.setState({ isLoggedIn: false });
      }
    }
    
    render () {
      const { isLoggedIn } = this.state;
      if (isLoggedIn) return (<Login onLogOut={this.handleLogOut} />)
      return (
        <div style={{textAlign: 'center'}}>
          <div>
              <h1>Please Log in</h1>
              <button onClick={this.handleLogIn}>Log in</button>
          </div>
        </div>
      )
    }
  }
   
  export default Home;