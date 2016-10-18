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
		String response = "words";
		
		while(stupidBot.lengthChecker(response))
		{
			
			response = display.collectResponse("What's good JB?");
		}
	}
}
