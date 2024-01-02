import Hello from "./Hello";
import {Component} from 'react';

class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      display: true
    };
  }
 
  delete = () => {
    this.setState({ display: false });
  };
 
  render() {
    const { display } = this.state;
    let comp;
    if (display) {
      comp = <Hello />;
    }
    return (
      <div style={{ textAlign: 'center' }}>
        {comp}
        <button onClick={this.delete}>
          Delete the component
        </button>
      </div>
    );
  }
}
 
export default Home;