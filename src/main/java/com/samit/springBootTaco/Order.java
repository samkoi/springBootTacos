package com.samit.springBootTaco;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class Order {
	@NotBlank(message="Name is required")
	private String name;
	@NotBlank(message="street is required")
	private String street;
	@NotBlank(message="city is required")
	private String city;
	@NotBlank(message="state is required")
	private String state;
	@NotBlank(message="zip is required")
	private String zip;
	@CreditCardNumber(message="Not a valid credit card number")
	private String ccNumber;
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
	           message="Must be formatted MM/YY")
	private String ccExpiration;
	@Digits(integer=3, fraction=0, message="Invalid CVV")
	private String ccCVV;
}
