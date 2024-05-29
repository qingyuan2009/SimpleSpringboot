package org.example.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;


@ApiModel("swagger response")
@Data
public class SwaggerResVO
{

	@ApiModelProperty("id")
	private Integer id;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

}
