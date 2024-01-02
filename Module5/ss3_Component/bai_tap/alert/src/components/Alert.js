import React from 'react';
import PropTypes from 'prop-types';
import "bootstrap/dist/css/bootstrap.css";

const Alert = ( props ) => (
  <div className="alert alert-warning" role="alert">
    {props.text}
  </div>
);

Alert.propTypes = {
  text: PropTypes.string.isRequired,
};
// PropTypes được sử dụng để kiểm tra loại của props. 
// Trong ví dụ này, text được kiểm tra để đảm bảo rằng nó là một string và là bắt buộc.

export default Alert;