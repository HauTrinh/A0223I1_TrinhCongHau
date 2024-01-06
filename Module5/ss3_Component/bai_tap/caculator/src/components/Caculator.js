import { Component } from 'react';

class Calculator extends Component {
  constructor(props) {
    super(props);
    this.state = {
      num1: 0,
      num2: 0,
      result: 0
    };
  }

  handleInputChange = (event) => {
    this.setState({
      [event.target.name]: Number(event.target.value) // Number() sẽ chuyển đổi giá trị nhập vào thành một số
    });
  }

  calculate = (operation) => {
    const { num1, num2 } = this.state;
    let result = 0;

    switch(operation) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case 'x':
        result = num1 * num2;
        break;
      case '/':
        if (num2 !== 0) {
          result = num1 / num2;
        } else {
          alert("Cannot divide by zero");
        }
        break;
      default:
        break;
    }

    this.setState({ result });
  }

  render() {
    const { num1, num2, result } = this.state;

    return (
      <div>
        <input type="number" name="num1" value={num1} onChange={this.handleInputChange} />
        <input type="number" name="num2" value={num2} onChange={this.handleInputChange} />
        <p>Result: {result}</p>
        <button onClick={() => this.calculate('+')}>+</button>
        <button onClick={() => this.calculate('-')}>-</button>
        <button onClick={() => this.calculate('x')}>x</button>
        <button onClick={() => this.calculate('/')}>/</button>
      </div>
    );
  }
}

export default Calculator;
