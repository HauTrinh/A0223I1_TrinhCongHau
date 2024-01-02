// import { Component } from "react";

// class Sum extends Component {
//     render () {
//         return (
//             <h1>Total: {this.props.firstNumber + this.props.secondNumber}</h1>
//         );
//     }
// }
const Sum = (props) => {
    const {firstNumber, secondNumber} = props;
    return (
        <h1>Total: {firstNumber + secondNumber}</h1>
    );
}
export default Sum;