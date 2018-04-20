package application;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ChallengerBlock extends HBox{
	private Challenger challenger;
	private TextField scoreInput;
	private Label challengerName;
	
	public ChallengerBlock() {
		this(null);
	}
	
	public ChallengerBlock(Challenger challenger) {
		this.challenger = challenger;
		this.scoreInput = new TextField();
		this.scoreInput.setPromptText("Enter Score");
		if(challenger == null) {
			this.challengerName = new Label("TBD");
			this.scoreInput.setEditable(false);
		} else {
			this.challengerName = new Label(this.challenger.getName());
		}	
		this.getChildren().addAll(this.challengerName, this.scoreInput);
	}
	
	public void setChallenger(Challenger challenger) {
		this.challenger = challenger;
	}
	
	public Challenger getChallenger() {
		return challenger;
	}
	
	public Integer getScore() {
		//TODO: implement
		return null;
	}

}
