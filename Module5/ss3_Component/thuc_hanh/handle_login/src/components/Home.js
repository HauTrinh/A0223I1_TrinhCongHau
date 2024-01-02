import { Component } from 'react';
import Logout from './Logout';

class Home extends Component{
    constructor (props) {
      super(props);
      this.state = {
        isLoggedIn: false
      };
    }
   
    handleLogIn = () => {
      this.setState({ isLoggedIn: true })
    }
   
    handleLogOut = () => {
      this.setState({ isLoggedIn: false })
    }
    
    render () {
      const { isLoggedIn } = this.state;
      if (isLoggedIn) return (<Logout onLogOut={this.handleLogOut} />)
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