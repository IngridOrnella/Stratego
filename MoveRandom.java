import java.util.Random;
class MoveRandom { //Le deplacement aléatoire 
	Random n=new Random(); 
	// generate a random number, between 0 and n-1 (0,1,2,3 in this case)
	int TheRandomNumber=n.nextInt(4);   
	public void setRandomPawnDirection() {
		switch(TheRandomNumber) {
		case 0:
			moveUp();
			break;
		case 1:
			moveLeft();
			break;
		case 2:
			moveRight();
			break;
		case 3:
			moveDonw();
			break;
		}
	}
	}




