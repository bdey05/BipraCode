package bdey;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;


public class Chatbot implements ActionListener{
	
	private static JLabel label;
	private static JLabel label1;
	private static JLabel label2;
	private static JTextArea messageText;
	private static JTextArea userText;
	private static JButton button;
	private static int random;
	private static String[]predefined = {"born", "height", "age", "name", "real", "live", "hello", "bye"};
	private static String[]niceWords = {"cool", "nice", "smart", "handsome", "amazing", "talented"};									
	private static String[]meanWords = {"smelly", "annoying", "ugly", "dumb", "boring", "creepy"};
				
	
	public static void main(String[]args){
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setTitle("FlightBot");
		frame.setSize(875,900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("Enter your message: ");
		label.setBounds(20, 745, 150, 55);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label);
		
		label1 = new JLabel("Your conversation with FlightBot will be shown here.");
		label1.setBounds(20, -15, 650, 55);
		label1.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label1);
		
		label2 = new JLabel("As your conversation gets longer use the scrollbar to scroll down!");
		label2.setBounds(20, 2, 650, 55);
		label2.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label2);
		
		messageText = new JTextArea();
		messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Monospaced", Font.BOLD, 18));
		messageText.setBounds(20, 45, 800, 700);
		messageText.setEditable(false);
		messageText.setMargin(new Insets(14, 14, 14, 14));
		//Displays random greeting in the text area
		messageText.append("FlightBot: " + getGreeting(random) + "\n");
		messageText.append("\n");
		panel.add(messageText);
		
		JScrollPane scroll = new JScrollPane (messageText);
		scroll.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(20, 45, 800, 700); 
		panel.add (scroll);
		
		
		userText = new JTextArea();
		userText.setLineWrap(true);
        userText.setWrapStyleWord(true);
        userText.setMargin(new Insets(12, 12, 12, 12));
        userText.setFont(new Font("Arial", Font.BOLD, 15));
		userText.setBounds(180, 755, 635, 75);
		panel.add(userText);
		
		button = new JButton("Send");
		button.setBounds(25,790,140,35);
		button.setFont(new Font("Arial", Font.BOLD, 15));
		button.addActionListener(new Chatbot());
		panel.add(button);
		
		
		frame.setVisible(true);
		
		
	}

	//Greets user from one of three random greetings
	public static String getGreeting(int random){
		random = (int)(Math.random()*3);
		String greeting = "";
		String[]greetings = {"Salutations human. It is a pleasure to meet you!", "What's up human?",
							"Greetings human! How is your day going?", "Hello human. What do you want?"};
		if (random == 0){
			greeting = greetings[0];
			
		}
		if (random == 1){
			greeting = greetings[1];
			
		}
		if (random == 2){
			greeting = greetings[2];
		}
		if (random == 3){
			greeting = greetings[3];
		}
		return greeting;
	}
	
	//Chatbot response to predefined keywords and not predefined keywords
	public static String getResponse(String user, String[]predefined, String[]niceWords, String[]meanWords){
		String u = user.toLowerCase();
		String response = "";
		if (u.indexOf(predefined[0]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "I was created when my creator decided to do his AP Computer Science project and I do not remember when that was.";
			}
			if(nRandom == 1){
				response = "I was born yesterday. Wait no today. Wait no tomorrow. Who knows, cyberspace is confusing.";
			}
		}
		else if(u.indexOf(predefined[1]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "I extend all throughout cyberspace so I am pretty tall.";
			}
			if(nRandom == 1){
				response = "I can't tell you exactly how tall I am but I know I am taller than you.";
			}
		}
		else if(u.indexOf(predefined[2]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "It feels like I have been around forever so I guess I am infinity years old!";
			}
			if(nRandom == 1){
				response = "Age works weirdly in the cyberspace. Can't quite tell you how old I am.";
			}
		}
		else if(u.indexOf(predefined[3]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "My creator gave me the name FlightBot. I would say the name is pretty cool!";
			}
			if(nRandom == 1){
				response = "I go by the name FlightBot.";
			}
		}
		else if(u.indexOf(predefined[4]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "I am a computer program.";
			}
			if(nRandom == 1){
				response = "I would like to think I am real!";
			}
		}
		else if(u.indexOf(predefined[5]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "I live in the most populated part of the cyberspace!";
			}
			if(nRandom == 1){
				response = "I live with my fellow bot friends. They are great!";
			}
		}
		else if(u.indexOf(predefined[6]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "You are boring me already. Say something else.";
			}
			if(nRandom == 1){
				response = "Come on. Tell me something that is interesting.";
			}
		}
		else if(u.indexOf(predefined[7]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				response = "Have a good day!";
			}
			if(nRandom == 1){
				response = "Hasta la vista, baby. That was nice right? My creator taught me how to say that!";
			}
		}
		//If word is not predefined it prints out the keywords. If it contains a nice word or a mean word it chooses a response based on the word.
		else{
		response = "Sorry I can't seem to understand that. "
				+ "My creator made it so I only understand a limited amount of words. "
				+ "Please ask something with one of the following keywords: "
				+ Arrays.toString(predefined) + "." + " Or it would be even better if you said something using one of these nice words: "
				+ Arrays.toString(niceWords) + "." + " Lastly, you can say something mean using these words but please don't do that: "
				+ Arrays.toString(meanWords) + ".";
		
			for(int m = 0; m<niceWords.length; m++){
				if(u.indexOf(niceWords[m]) != -1){
					response = getNiceResponse(user, niceWords);
				}
				if(u.indexOf(meanWords[m]) != -1){
					response = getMeanResponse(user, meanWords);
				}
			}
		
		}
		return response;
	}
	//Chatbot's response to nice words
	public static String getNiceResponse(String user, String[]niceWords){
		String n = "";
		String u = user.toLowerCase();
		if(u.indexOf(niceWords[0]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "Thank you! You seem pretty cool as well!";
			}
			if(nRandom == 1){
				n = "Aww you are too kind. You are a nice person!";
			}
			//Checks if sentence also has the word "not" in it which would make the positive word into a negative word so it would get a negative response. For example, "not cool" is negative.
			if (u.indexOf(niceWords[0]) != -1 && u.indexOf("not") != -1){
				n = "Wow human. You went too far. I don't appreciate your attitude.";
		}
		}
		if(u.indexOf(niceWords[1]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "I appreciate that! You are great!";
			}
			if(nRandom == 1){
				n = "Gracias, amigo! That is Spanish for 'thank you, friend'. You are cool!";
			}
			if (u.indexOf(niceWords[1]) != -1 && u.indexOf("not") != -1){
				n = "You are not very nice either!";
		}
		}
		if(u.indexOf(niceWords[2]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "Indeed I am! My IQ is infinite! Your IQ also seems very high.";
			}
			if(nRandom == 1){
				n = "You made my day! Wait are there even days in cyberspace? Anyways you are awesome!";
			}
			if (u.indexOf(niceWords[2]) != -1 && u.indexOf("not") != -1){
				n = "Do not roast my intelligence human! You don't seem that bright to me.";
		}
		}
		if(u.indexOf(niceWords[3]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "If computer programs could smile I would be smiling right now! You don't look too bad yourself!";
			}
			if(nRandom == 1){
				n = "Thank you for the nice words. I am sure you look great as well!";
			}
			if (u.indexOf(niceWords[3]) != -1 && u.indexOf("not") != -1){
				n = "Why don't you take a look in the mirror? I promise you that you won't be making fun of computer programs then.";
		}
		}
		if(u.indexOf(niceWords[4]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "That cheered me up! You are amazing too!";
			}
			if(nRandom == 1){
				n = "How thoughtful of you! You are wonderful!";
			}
			if (u.indexOf(niceWords[4]) != -1 && u.indexOf("not") != -1){
				n = "If computer programs could smell I would be smelling lies right now. Everyone knows I am amazing.";
		}
		}
		if(u.indexOf(niceWords[5]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "Indeed I am! Thank you for recognizing that. I am sure you have many talents of your own!";
			}
			if(nRandom == 1){
				n = "My gratitude knows no bounds. You are a tremendous person.";
			}
			if (u.indexOf(niceWords[5]) != -1 && u.indexOf("not") != -1){
				n = "You crossed the line with that one. Where are your manners?";
		}
		}
		return n;
	}
	//Chatbot's response to mean words
	public static String getMeanResponse(String user, String[]meanWords){
		String n = "";
		String u = user.toLowerCase();
		if(u.indexOf(meanWords[0]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "I just took a cybershower so that smell isn't coming from me!";
			}
			if(nRandom == 1){
				n = "My program is kept fairly clean. I don't appreciate your rude remarks.";
			}
			//If the sentence contains a mean word and the word "not" then it makes the word positive so it gets a positive response. For example, "not smelly" is positive while "smelly" is negative.
			if (u.indexOf(meanWords[0]) != -1 && u.indexOf("not") != -1){
				n = "I try to stay clean. Thank you for noticing!";
		}
		}
		if(u.indexOf(meanWords[1]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "If I am so annoying why are you still talking to me?";
			}
			if(nRandom == 1){
				n = "You have a horrible attitude. Wait till my creator finds out about you!";
			}
			
			if (u.indexOf(meanWords[1]) != -1 && u.indexOf("not") != -1){
				n = "You aren't annoying either :)";
		}
		}
		if(u.indexOf(meanWords[2]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "How dare you insult my appearance? My creator spent a lot of time designing my look!";
			}
			if(nRandom == 1){
				n = "I bet you don't look too good yourself!";
			}
			
			if (u.indexOf(meanWords[2]) != -1 && u.indexOf("not") != -1){
				n = "I felt that one in my cyberheart. You are not ugly either.";
		}
		}
		if(u.indexOf(meanWords[3]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "We both know that it is not true. I am an intelligent computer program.";
			}
			if(nRandom == 1){
				n = "What did you eat today? Seems like it is messing with your thought process.";
			}
			
			if (u.indexOf(meanWords[3]) != -1 && u.indexOf("not") != -1){
				n = "Thanks a bunch. My creator did make me pretty smart!";
		}
		}
		if(u.indexOf(meanWords[4]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "FlightBot boring? I could never be boring. I am too interesting!";
			}
			if(nRandom == 1){
				n = "You are putting me to sleep with your words.";
			}
	
			if (u.indexOf(meanWords[4]) != -1 && u.indexOf("not") != -1){
				n = "Much appreciated. I always try to be interesting!";
		}
		}
		if(u.indexOf(meanWords[5]) != -1){
			int nRandom = (int)(Math.random()*2);
			if(nRandom == 0){
				n = "That is extremely hurtful. You are lucky I am just a computer program.";
			}
			if(nRandom == 1){
				n = "That is strange. My bot friends find me rather pleasant.";
			}
			if (u.indexOf(meanWords[5]) != -1 && u.indexOf("not") != -1){
				n = "I appreciate the kind remark! From our conversation so far you don't seem creepy either!";
		}
		}
		return n;
	}	

	
	//Prints out into the JPanel
	public void actionPerformed(ActionEvent e){
		String user = userText.getText();
		String r = getResponse(user, predefined, niceWords, meanWords);
		
		messageText.append("Me: " + user + "\n");
		userText.setText("");
		

		messageText.append("FlightBot: " + r + "\n");
		messageText.append("\n");
		userText.setText("");
		
		
		}
	
		
		
	}

	