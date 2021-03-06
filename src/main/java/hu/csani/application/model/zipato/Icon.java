package hu.csani.application.model.zipato;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Icon {

	@SerializedName("link")
	@Expose
	private String link;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("endpointType")
	@Expose
	private String endpointType;
	@SerializedName("relativeUrl")
	@Expose
	private String relativeUrl;

	
}
