
import {Component} from "react";

class Time extends Component {
    render() {
        return (
            <div>
                <h1>Hello Việt Nam</h1>
                <h2>This time: { new Date().toLocaleTimeString()}.</h2>
            </div>
        );
    }
}
export default Time;