// import { Component } from "react";
//Function Components
const Welcome = (props) => {
    const {name, age, gender} = props;
    console.log(props)
    return (
        <div>
            <h1>Xin chào {name} !</h1>
                <h2>Tôi {age}</h2>
                <h2> Giới tính {gender}</h2>
         </div>
    );
};

Welcome.defaultProps = {
    name: 'Công Hậu',
    age: 18,
    gender:1
}
// Class Component
// class Welcome extends Component {
//     render() {
//         console.log(this.props)
//         return (
//             <div>
//                 <h1>Xin chào {this.props.name} !</h1>
//                 <h2>Năm nay {this.props.age}</h2>
//             </div>
//         );
//     }
// }
export default Welcome;