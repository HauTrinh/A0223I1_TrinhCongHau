package com.codegym.validate_form.dto;


import lombok.*;
import org.springframework.validation.Errors;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
// nếu dùng custom thì thêm  -- implements Validator
public class UserDTO  {
    @Min(value = 18, message = "Độ tuổi phải lớn hơn hoặc bằng 18")
    private int age;

    @NotNull(message = "thông tin bắt buộc")
    @Pattern(regexp = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$",
            message = "Sai định dạng email !! Vui lòng nhập lại")
    private String email;


    @NotNull(message = "thông tin bắt buộc")
    @Size(min = 5, max = 45, message = "độ dài tối thiểu là 5 và tối da là 45")
    private String firstName;

    @NotNull(message = "thông tin bắt buộc")
    @Size(min = 5, max = 45, message = "độ dài tối thiểu là 5 và tối da là 45")
    private String lastName;

    @Size(min=10, max = 11)
    @Pattern(regexp = "^0\\d{9,10}$",
            message = "Sai định dạng só điện thoại !! Vui lòng nhập lại")
    private String phone;


//    @Override
//    public void validate(Object target, Errors errors) {
//        UserDTO userDTO = (UserDTO)target;
//        if ("".equals(userDTO.getPhone())){
//            errors.rejectValue("phone",null,"Require input data");
//        }else if (!userDTO.getPhone().matches("^0\\d{9,10}$")){
                                                //bắt đầu từ 0, \\d đại diện cho bất kỳ chữ số nào, và có từ 9 -10 chữ số
//            errors.rejectValue("phone",null,"Not Match Regex");
//        }
//    }
}
