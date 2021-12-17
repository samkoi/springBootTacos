package com.samit.springBootTaco;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	@NotNull
	@Size(min=5, message="Invalid Name")
    private String name;
	@Size(min=1, message="Needs atleast 1 ingredient")
    private List<String> ingredients;
}
