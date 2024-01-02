import {Component} from 'react';
class InDecrease extends Component {
    constructor(props) {
        super(props);
        this.state = {  
            number: 0
        };
    }

    increase = () =>{
        this.setState({ number: this.state.number +1});
        console.log(this.state.number);
    }
    decrease = () =>{
        this.setState({ number: this.state.number - 1});
        console.log(this.state.number);
    }
    render() {
        return(
           <div style={ { textAlign: "center", padding: 30, fontSize: 50}}>
                <button style={{ textAlign: "center", padding: 10, fontSize: 30}} onClick={this.decrease} >Decrease</button>
                <span style={{ padding: 10 }}>{this.state.number}</span>
                <button style={{ textAlign: "center", padding: 10, fontSize: 30}} onClick={this.increase}>Increase</button>
            </div>
        );
    }
}
export default InDecrease;