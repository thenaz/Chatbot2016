package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatViewer display;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("unintelligent chat machine");
		display = new ChatViewer();
	}
	

	public void start()
	{
		String response = display.collectResponse("What's good JB?");
		
		while(stupidBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("Oh, you aren't JB " + response +"?? Tell me who you are...");
			
		}
	}
	
	private String useChatbotCheckers(String input)
	{
		String checkedInput = "";
		
		if(stupidBot.memeChecker(input))
		{
			checkedInput += "\nYou like memes!\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkedInput += "\nYou know my secret topic!\n";
		}
		
		if(checkedInput.length() == 0)
		{
			checkedInput = "I have no idea, what do you mean about " + input ;
		}
		
		return checkedInput = "";
	}
}
