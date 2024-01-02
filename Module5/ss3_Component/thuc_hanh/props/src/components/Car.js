// import {Component} from 'react';
// class Car extends Component {
//     render() {
//       return <h2>I am a {this.props.color} Car!</h2>;
//     }
//   }

function Car(props) {
  return <h2>I am a {props.color} Car!</h2>;
}

export default Car;  