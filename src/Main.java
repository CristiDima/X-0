import java.util.Scanner;

public class Main {
	public static boolean playerTurn = true;
	public static boolean player1Won = false;
	public static boolean player2Won = false;
	public static boolean playing = true;
	
	public static Scanner scan = new Scanner(System.in);
	public static boolean playAgain = false;
	
	public static TicTacToe board = new TicTacToe();
	
	public static void main(String[] args){
		if(board.isVisible() == false){
			board.setVisible(true);
			}
		}
	
	public static void checkforwin(){
		if(board.button1.getText().equals("X")){
			if(board.button4.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button1.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}	
		
		if(board.button1.getText().equals("X")){
			if(board.button2.getText().equals("X")){
				if(board.button3.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button3.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button3.getText().equals("X")){
			if(board.button6.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button7.getText().equals("X")){
			if(board.button8.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button4.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button6.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button2.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button8.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		
		if(board.button1.getText().equals("0")){
			if(board.button4.getText().equals("0")){
				if(board.button7.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button1.getText().equals("0")){
			if(board.button5.getText().equals("0")){
				if(board.button9.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}	
		
		if(board.button1.getText().equals("0")){
			if(board.button2.getText().equals("0")){
				if(board.button3.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button3.getText().equals("0")){
			if(board.button5.getText().equals("0")){
				if(board.button7.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button3.getText().equals("0")){
			if(board.button6.getText().equals("0")){
				if(board.button9.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button1.getText().equals("0")){
			if(board.button8.getText().equals("0")){
				if(board.button9.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button4.getText().equals("0")){
			if(board.button5.getText().equals("0")){
				if(board.button6.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(board.button2.getText().equals("0")){
			if(board.button5.getText().equals("0")){
				if(board.button8.getText().equals("0")){
					player2Won = true;
					player1Won = false;
					System.out.println("Player 2 Won!");
				}
			}
		}
		
		if(player1Won == true || player2Won == true){
			System.out.println("Would you like play again? true or flase");
			playAgain = scan.nextBoolean();
			if(playAgain == true){
				board.setVisible(false);
				System.out.println("Player1 Won: " + player1Won);
				System.out.println("Player2 Won: " + player2Won);
				board.button1.setText("");
				board.button2.setText("");
				board.button3.setText("");
				board.button4.setText("");
				board.button5.setText("");
				board.button6.setText("");
				board.button7.setText("");
				board.button8.setText("");
				board.button9.setText("");
				playerTurn = true;
				player1Won = false;
				player2Won = false;
				board.setVisible(true);
			}else{
				System.out.println("Thanks for playing...");
			}
		}
		
	}
}



