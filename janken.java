/**
 * @(#)janken.java
 *
 *
 * @author 
 * @version 1.00 2021/1/15
 */
 
 import java.lang.Math; //for random
 import java.util.*; //for stack
 import java.io.*; //for stack

public class janken {
        
    /**
     * Creates a new instance of <code>janken</code>.
     */
    public janken() {
    }
    
    
    public static void main(String[] args) {
    	
    	//POWER
    	int[] cardPower = new int[30]; //30 cards
    	int power=1;
    	
    	for(int ctr=0; ctr<=29; ctr++){
    		cardPower[ctr] = power; 
    		power++; //assign 1-5 power to 30 cards
    		
    	if (power>5)
    		power = 1; //reset value of power			
    	}
    	
    	    	
    	//TYPE    	
    	int[] cardType = new int[30]; //30 cards
    	int type=1; // 1=rock , 2=paper , 3=scissors
    	
    	for(int ctr=0; ctr<=29; ctr++){
    		cardType[ctr] = type; 
    		type++; //assign 1-3 type to 30 cards
    		
    	if (type>3)
    		type = 1; //reset value of type			
    	}
    	
    	
    	//COLOR
    	int[] cardColor = new int[30]; //30 cards
    	int color=1; // 1=red, 2=blue, 3=yellow, 4=green
    	
    	for(int ctr=0; ctr<=29; ctr++){
    		cardColor[ctr] = color; 
    		color++; //assign 1-4 color to 30 cards
    		
    	if (color>4)
    		color = 1; //reset value of color			
    	}
    	
    	//2 dimensional array
    	int[][] cardData = {cardPower, cardType, cardColor};
    	
    	//CARD FINAL; each will hold 3 values
    	
    	int address = 0; //for 2d array use
    	
    	int[] dummycard = {0,0,0};
    	int[] card1 = new int[3];
    	int[] card2 = new int[3]; 
    	int[] card3 = new int[3]; 
    	int[] card4 = new int[3]; 
    	int[] card5 = new int[3];
    	int[] card6 = new int[3];
    	int[] card7 = new int[3];
    	int[] card8 = new int[3];
    	int[] card9 = new int[3];
    	int[] card10 = new int[3];
    	int[] card11 = new int[3]; 
    	int[] card12 = new int[3];
    	int[] card13 = new int[3];
    	int[] card14 = new int[3];
    	int[] card15 = new int[3];
    	int[] card16 = new int[3];
    	int[] card17 = new int[3];
    	int[] card18 = new int[3];
    	int[] card19 = new int[3];
    	int[] card20 = new int[3];
    	int[] card21 = new int[3];
    	int[] card22 = new int[3];
    	int[] card23 = new int[3];
    	int[] card24 = new int[3];
    	int[] card25 = new int[3];
    	int[] card26 = new int[3];
    	int[] card27 = new int[3];
    	int[] card28 = new int[3];
    	int[] card29 = new int[3];
    	int[] card30 = new int[3];	
    		
    	//inserting power, type, color values into cards	
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card1[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; //2d array address increment for next loop
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card2[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card3[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; 
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card4[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; 
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card5[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; 
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card6[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card7[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; 
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card8[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card9[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++; 
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card10[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card11[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    			
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card12[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card13[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card14[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card15[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card16[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card17[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card18[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card19[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card20[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card21[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card22[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card23[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card24[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card25[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card26[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card27[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card28[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card29[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		
    	for (int ctr=0; ctr<=2; ctr++){   		
    		card30[ctr] = cardData[ctr][address];
    		if (ctr == 2)
    			address++;
    		}
    		    	
    	
    	//DECK SHUFFLE & DISTRIBUTION  	
    	int[] valueHolder = new int[30]; //array that REPRESENTS only the card value
    	Stack<Integer> deckStack = new Stack<Integer>(); //stack that will contain actual deck
    	
    	//Insert values in valueHolder array
    	for(int ctr=0; ctr<30; ctr++){ 
    		valueHolder[ctr] = ctr;    		
    		}
    	
    	boolean goSignal = true; //for checking of cards if all are pushed (refer to for loop after switch case)
    	
    	//will run until all cards are pushed
    	while (goSignal == true) { 
    	   	
    	int randomCard = (int)(Math.random() * valueHolder.length); //picking random value from 0-29    	
    	   	
    	//Pushing cards into deck
    	switch (randomCard) { 
  case 0:
  	//to check so will only push once
  	if (valueHolder[randomCard] != -1) {
    deckStack.push(0); //value of random is same value of case & card
    valueHolder[randomCard] = -1; 
  	}	
    break;
  case 1:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(1);
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 2:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(2); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 3:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(3);
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 4:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(4);
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 5:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(5); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 6:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(6); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 7:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(7); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 8:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(8); 
    valueHolder[randomCard] = -1; 
  	}
    break; 
  case 9:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(9); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 10:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(10); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 11:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(11); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 12:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(12); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 13:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(13); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 14:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(14); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 15:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(15); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 16:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(16); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 17:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(17); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 18:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(18); 
    valueHolder[randomCard] = -1; 
  	}
    break;
  case 19:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(19); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 20:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(20); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 21:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(21); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 22:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(22); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 23:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(23); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 24:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(24); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 25:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(25); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 26:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(26); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 27:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(27); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 28:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(28); 
    valueHolder[randomCard] = -1; 
  	}
    break;
   case 29:
    if (valueHolder[randomCard] != -1) {
    deckStack.push(29); 
    valueHolder[randomCard] = -1; 
  	}
    break;
     
}
	//checking if there are still cards not pushed; if pushCtr == array.length, then all cards pushed
	for (int ctr=0, pushCtr=0; ctr<valueHolder.length; ctr++) {		
		if (valueHolder[ctr] == -1){
			pushCtr++;}
		
		if (pushCtr == valueHolder.length){
			goSignal = false;}
	}
	
	//seperate bracket from for loop
    		}  	
    
    //CARD PLAYING
    			
    	//print the full deck
    	System.out.println(deckStack);
    	
    	//drawing 5 cards for player from deck
    	int[] playerHand = new int[5];
    	
    	for (int ctr=0; ctr<playerHand.length; ctr++){
    		playerHand[ctr] = deckStack.pop();
    	}
    	
    	//drawing 5 cards for enemy from deck
    	int[] enemyHand = new int[5];
    	
    	for (int ctr=0; ctr<enemyHand.length; ctr++){
    		enemyHand[ctr] = deckStack.pop();
    	}
    	
    	
    	//INTIALIZATION FOR ROUND LOOP
    	Scanner scan = new Scanner(System.in); //choosing cards
    	boolean goSignal1 = false; //check if player chosen card is in hand; goSignal 1 is false but turns true if player has the card   	
    	    	
    	//temporary holds card when played so array can be reused
    	int[] tempPlayerCard = new int[3];
    	int[] tempEnemyCard = new int[3];
    		
		boolean playerRoundWin = false; //for checking whose card wins
		boolean enemyRoundWin = false; //for checking whose card wins		
		    	
    	//2d array holder of winning cards
    	int [][] playerWinCard = new int[20][];
    	int [][] enemyWinCard = new int[20][];
    	
    	//putting a dummy card so values wont be null at first check
    	for (int ctr=0; ctr < playerWinCard.length; ctr++){
    		playerWinCard[ctr] = dummycard;
    	}
    	
    	for (int ctr=0; ctr < enemyWinCard.length; ctr++){
    		enemyWinCard[ctr] = dummycard;
    	}
    	
    	int playerCardCtr = 0; //to determine which position to place the winning card
    	int enemyCardCtr = 0;
    	
    	//winning card counters / winning boolean				1 rock, 2 paper, 3 scissor & 1 red, 2 blue, 3 yellow, 4 green
    	int playerType1Ctr=0, playerType2Ctr=0, playerType3Ctr=0;
    	boolean playerType1=false, playerType2=false, playerType3=false;
    	boolean playerRedRock=false, playerRedPaper=false, playerRedScissors=false;
    	boolean playerBlueRock=false, playerBluePaper=false, playerBlueScissors=false;
    	boolean playerYellowRock=false, playerYellowPaper=false, playerYellowScissors=false;
    	boolean playerGreenRock=false, playerGreenPaper=false, playerGreenScissors=false;
    	int playerColor1Ctr=0, playerColor2Ctr=0, playerColor3Ctr=0;
    	
    	int enemyType1Ctr=0, enemyType2Ctr=0, enemyType3Ctr = 0;    	
    	boolean enemyType1=false, enemyType2=false, enemyType3=false;
    	boolean enemyRedRock=false, enemyRedPaper=false, enemyRedScissors=false;
    	boolean enemyBlueRock=false, enemyBluePaper=false, enemyBlueScissors=false;
    	boolean enemyYellowRock=false, enemyYellowPaper=false, enemyYellowScissors=false;
    	boolean enemyGreenRock=false, enemyGreenPaper=false, enemyGreenScissors=false;
   		int enemyColor1Ctr=0, enemyColor2Ctr=0, enemyColor3Ctr=0;
    	
    	  	
    	boolean playerTypeWin = false;
    	boolean playerColorWin = false;
    	boolean enemyTypeWin = false;
    	boolean enemyColorWin = false;
    	
    	int roundCtr = 1; //round counter 
    	
    	//START OF LOOP !!!    	    	
		do {		    	
    	
    	//printing new deck and player+enemy hand
    	System.out.println("\nRound: " + roundCtr);
    	System.out.println("\nDeck: " + deckStack);
    	System.out.println("\nPlayer hand: " + Arrays.toString(playerHand));
    	System.out.println("\nEnemy hand: " + Arrays.toString(enemyHand));
    	
    	//choosing card    	
    	System.out.println("\nChoose card to play: ");
    	int chosenCard = scan.nextInt();
    	
    	//check if player chosen card is in hand; goSignal 1 is false but turns true if player has the card
    	for (int ctr = 0; ctr<playerHand.length;ctr++)
    	{
    		if(playerHand[ctr]==chosenCard)
    			goSignal1 = true;
    	}    	
    	
    	//print chosen card if condition is satisfied
    	if (goSignal1==true) {
    	
    	switch (chosenCard) { 
  case 0:
  	System.out.println("\nChosen card: Card 1" + Arrays.toString(card1));
  	tempPlayerCard = card1;
    break;
  case 1:
    System.out.println("\nChosen card: Card 2" + Arrays.toString(card2));
    tempPlayerCard = card2;
    break;
  case 2:
    System.out.println("\nChosen card: Card 3" + Arrays.toString(card3));
    tempPlayerCard = card3;
    break;
  case 3:
    System.out.println("\nChosen card: Card 4" + Arrays.toString(card4));
    tempPlayerCard = card4;
    break;
  case 4:
    System.out.println("\nChosen card: Card 5" + Arrays.toString(card5));
    tempPlayerCard = card5;
    break;
  case 5:
    System.out.println("\nChosen card: Card 6" + Arrays.toString(card6));
    tempPlayerCard = card6;
    break;
  case 6:
    System.out.println("\nChosen card: Card 7" + Arrays.toString(card7));
    tempPlayerCard = card7;
    break;
  case 7:
    System.out.println("\nChosen card: Card 8" + Arrays.toString(card8));
    tempPlayerCard = card8;
    break;
  case 8:
    System.out.println("\nChosen card: Card 9" + Arrays.toString(card9));
    tempPlayerCard = card9;
    break; 
  case 9:
    System.out.println("\nChosen card: Card 10" + Arrays.toString(card10));
    tempPlayerCard = card10;
    break;
  case 10:
    System.out.println("\nChosen card: Card 11" + Arrays.toString(card11));
    tempPlayerCard = card11;
    break;
  case 11:
    System.out.println("\nChosen card: Card 12" + Arrays.toString(card12));
    tempPlayerCard = card12;
    break;
  case 12:
    System.out.println("\nChosen card: Card 13" + Arrays.toString(card13));
    tempPlayerCard = card13;
    break;
  case 13:
    System.out.println("\nChosen card: Card 14" + Arrays.toString(card14));
    tempPlayerCard = card14;
    break;
  case 14:
    System.out.println("\nChosen card: Card 15" + Arrays.toString(card15));
    tempPlayerCard = card15;
    break;
  case 15:
    System.out.println("\nChosen card: Card 16" + Arrays.toString(card16));
    tempPlayerCard = card16;
    break;
  case 16:
    System.out.println("\nChosen card: Card 17" + Arrays.toString(card17));
    tempPlayerCard = card17;
    break;
  case 17:
    System.out.println("\nChosen card: Card 18" + Arrays.toString(card18));
    tempPlayerCard = card18;
    break;
  case 18:
    System.out.println("\nChosen card: Card 19" + Arrays.toString(card19));
    tempPlayerCard = card19;
    break;
  case 19:
    System.out.println("\nChosen card: Card 20" + Arrays.toString(card20));
    tempPlayerCard = card20;
    break;
  case 20:
    System.out.println("\nChosen card: Card 21" + Arrays.toString(card21));
    tempPlayerCard = card21;
    break;
  case 21:
    System.out.println("\nChosen card: Card 22" + Arrays.toString(card22));
    tempPlayerCard = card22;
    break;
  case 22:
    System.out.println("\nChosen card: Card 23" + Arrays.toString(card23));
    tempPlayerCard = card23;
    break;
  case 23:
    System.out.println("\nChosen card: Card 24" + Arrays.toString(card24));
    tempPlayerCard = card24;
    break;
  case 24:
    System.out.println("\nChosen card: Card 25" + Arrays.toString(card25));
    tempPlayerCard = card25;
    break;
  case 25:
    System.out.println("\nChosen card: Card 26" + Arrays.toString(card26));
    tempPlayerCard = card26;
    break;
  case 26:
    System.out.println("\nChosen card: Card 27" + Arrays.toString(card27));
    tempPlayerCard = card27;
    break;
  case 27:
    System.out.println("\nChosen card: Card 28" + Arrays.toString(card28));
    tempPlayerCard = card28;
    break;
  case 28:
    System.out.println("\nChosen card: Card 29" + Arrays.toString(card29));
    tempPlayerCard = card29;
    break;
  case 29:
    System.out.println("\nChosen card: Card 30" + Arrays.toString(card30));
    tempPlayerCard = card30;
    break;
     
}
    	}
    	else System.out.println("\nYou dont have this card.");
    	
 	//enemy choosing a card from his hand
 	 int enemyChoice = (int)(Math.random() * enemyHand.length); //picking random value from 0-4
    	
    switch (enemyHand[enemyChoice]) { 
  case 0:
  	System.out.println("\nEnemyy chosen card: Card 1" + Arrays.toString(card1));
  	tempEnemyCard = card1;
    break;
  case 1:
    System.out.println("\nEnemyy chosen card: Card 2" + Arrays.toString(card2));
    tempEnemyCard = card2;
    break;
  case 2:
    System.out.println("\nEnemyy chosen card: Card 3" + Arrays.toString(card3));
    tempEnemyCard = card3;
    break;
  case 3:
    System.out.println("\nEnemyy chosen card: Card 4" + Arrays.toString(card4));
    tempEnemyCard = card4;
    break;
  case 4:
    System.out.println("\nEnemyy chosen card: Card 5" + Arrays.toString(card5));
    tempEnemyCard = card5;
    break;
  case 5:
    System.out.println("\nEnemyy chosen card: Card 6" + Arrays.toString(card6));
    tempEnemyCard = card6;
    break;
  case 6:
    System.out.println("\nEnemyy chosen card: Card 7" + Arrays.toString(card7));
    tempEnemyCard = card7;
    break;
  case 7:
    System.out.println("\nEnemyy chosen card: Card 8" + Arrays.toString(card8));
    tempEnemyCard = card8;
    break;
  case 8:
    System.out.println("\nEnemyy chosen card: Card 9" + Arrays.toString(card9));
    tempEnemyCard = card9;
    break; 
  case 9:
    System.out.println("\nEnemyy chosen card: Card 10" + Arrays.toString(card10));
    tempEnemyCard = card10;
    break;
  case 10:
    System.out.println("\nEnemyy chosen card: Card 11" + Arrays.toString(card11));
    tempEnemyCard = card11;
    break;
  case 11:
    System.out.println("\nEnemyy chosen card: Card 12" + Arrays.toString(card12));
    tempEnemyCard = card12;
    break;
  case 12:
    System.out.println("\nEnemyy chosen card: Card 13" + Arrays.toString(card13));
    tempEnemyCard = card13;
    break;
  case 13:
    System.out.println("\nEnemyy chosen card: Card 14" + Arrays.toString(card14));
    tempEnemyCard = card14;
    break;
  case 14:
    System.out.println("\nEnemyy chosen card: Card 15" + Arrays.toString(card15));
    tempEnemyCard = card15;
    break;
  case 15:
    System.out.println("\nEnemyy chosen card: Card 16" + Arrays.toString(card16));
    tempEnemyCard = card16;
    break;
  case 16:
    System.out.println("\nEnemyy chosen card: Card 17" + Arrays.toString(card17));
    tempEnemyCard = card17;
    break;
  case 17:
    System.out.println("\nEnemyy chosen card: Card 18" + Arrays.toString(card18));
    tempEnemyCard = card18;
    break;
  case 18:
    System.out.println("\nEnemyy chosen card: Card 19" + Arrays.toString(card19));
    tempEnemyCard = card19;
    break;
  case 19:
    System.out.println("\nEnemyy chosen card: Card 20" + Arrays.toString(card20));
    tempEnemyCard = card20;
    break;
  case 20:
    System.out.println("\nEnemyy chosen card: Card 21" + Arrays.toString(card21));
    tempEnemyCard = card21;
    break;
  case 21:
    System.out.println("\nEnemyy chosen card: Card 22" + Arrays.toString(card22));
    tempEnemyCard = card22;
    break;
  case 22:
    System.out.println("\nEnemyy chosen card: Card 23" + Arrays.toString(card23));
    tempEnemyCard = card23;
    break;
  case 23:
    System.out.println("\nEnemyy chosen card: Card 24" + Arrays.toString(card24));
    tempEnemyCard = card24;
    break;
  case 24:
    System.out.println("\nEnemyy chosen card: Card 25" + Arrays.toString(card25));
    tempEnemyCard = card25;
    break;
  case 25:
    System.out.println("\nEnemyy chosen card: Card 26" + Arrays.toString(card26));
    tempEnemyCard = card26;
    break;
  case 26:
    System.out.println("\nEnemyy chosen card: Card 27" + Arrays.toString(card27));
    tempEnemyCard = card27;
    break;
  case 27:
    System.out.println("\nEnemyy chosen card: Card 28" + Arrays.toString(card28));
    tempEnemyCard = card28;
    break;
  case 28:
    System.out.println("\nEnemyy chosen card: Card 29" + Arrays.toString(card29));
    tempEnemyCard = card29;
    break;
  case 29:
    System.out.println("\nEnemyy chosen card: Card 30" + Arrays.toString(card30));
    tempEnemyCard = card30;
    break;
     
}

    //check who wins by type, and then by power
    if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 3) //player rock & enemy scissors
    	{
    	System.out.println("\nPlayer wins by type!");
    	playerRoundWin = true;
    	}
    
    else if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 2) //player rock && enemy paper
    	{   
    	System.out.println("\nEnemy wins by type!");
    	enemyRoundWin = true;
    	}	
    	
    else if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 1) //both rock
    {
    	if (tempPlayerCard[0] > tempEnemyCard[0])
    	{    	
    		System.out.println("\nPlayer wins by power!");
    		playerRoundWin = true;
    	}
    		
    	else if	(tempPlayerCard[0] < tempEnemyCard[0])
    		{    	
    		System.out.println("\nEnemy wins by power!");
    		enemyRoundWin = true;
  		  	}
    		
    	else if (tempPlayerCard[0] == tempEnemyCard[0])
    		System.out.println("\nDRAW BY POWER!");	
    }
    	
    else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 1) //player paper && enemy rock
    	{
    	System.out.println("\nPlayer wins by type!");
    	playerRoundWin = true;
    	}	
    
    else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 3) //player paper && enemy scissors
    	{   
    	System.out.println("\nEnemy wins by type!");
    	enemyRoundWin = true;
    	}
    	
    else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 2) //both paper
    {
    	if (tempPlayerCard[0] > tempEnemyCard[0])
    	{    	
    		System.out.println("\nPlayer wins by power!");
    		playerRoundWin = true;
    	}
    		
    	else if	(tempPlayerCard[0] < tempEnemyCard[0])
    		{    	
    		System.out.println("\nEnemy wins by power!");
    		enemyRoundWin = true;
  		  	}
    		
    	else if (tempPlayerCard[0] == tempEnemyCard[0])
    		System.out.println("\nDRAW BY POWER!");	
    }
    
    else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 2) //player scissors && enemy paper
   		{
    	System.out.println("\nPlayer wins by type!");
    	playerRoundWin = true;
    	}
   		
   	else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 1) //player scissors && enemy rock
    	{   
    	System.out.println("\nEnemy wins by type!");
    	enemyRoundWin = true;
    	}
    	
    else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 3) //both scissors
    {
    	if (tempPlayerCard[0] > tempEnemyCard[0])
    		{    	
    		System.out.println("\nPlayer wins by power!");
    		playerRoundWin = true;
    		}
    		
    	else if	(tempPlayerCard[0] < tempEnemyCard[0])
  		  	{    	
    		System.out.println("\nEnemy wins by power!");
    		enemyRoundWin = true;
  		  	}
    		
    	else if (tempPlayerCard[0] == tempEnemyCard[0])
    		System.out.println("\nDRAW BY POWER!");	
    }				
    	
    	System.out.println("\n-------------------------------------------------------");	
    	
    	if (playerRoundWin == true)
    	{
    		playerWinCard[playerCardCtr] = tempPlayerCard;
    		playerCardCtr++;
    		playerRoundWin = false;
    	}
    	else if (enemyRoundWin == true)
    	{
    		enemyWinCard[enemyCardCtr] = tempEnemyCard;
    		enemyCardCtr++;
    		enemyRoundWin = false;
    	}
    	
    	//check winning cards
    	System.out.println("\nPlayer's Winning Cards: " + Arrays.deepToString(playerWinCard));
    	System.out.println("\nEnemy's Winning Cards: " + Arrays.deepToString(enemyWinCard));
    	
    	System.out.println("\n-------------------------------------------------------\n");
    	
    	//replace chosen card with another card from deck
    	for (int ctr=0; ctr < playerHand.length; ctr++){
    		if (playerHand[ctr] == chosenCard){
    			playerHand[ctr] = deckStack.pop(); 
    		}
    	}
    	
    	for (int ctr=0; ctr < enemyHand.length; ctr++){
    		if (enemyHand[ctr] == enemyHand[enemyChoice]){
    			enemyHand[ctr] = deckStack.pop(); 
    		}
    	}
    	
    	//TERMINATION OF BOOLEANS/RESETTING OF VALUES FOR NEXT ROUND
    	goSignal1 = false;
    	playerRoundWin = false;
    	enemyRoundWin = false;  	    	
    	roundCtr++;
    	
    	//CHECKING IF SOMEONE WINS THE GAME
    	//player check
    	for (int ctr=0; ctr < playerWinCard.length; ctr++){
    		//type check
    		if (playerWinCard[ctr][1] == 1)
    		{
    			playerType1 = true;
    		}
    		if (playerWinCard[ctr][1] == 2)
    		{
    			playerType2 = true;
    		}
    		if (playerWinCard[ctr][1] == 3)
    		{
    			playerType3 = true;
    		}
    		
    		//color check
    		if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 1) //rocks
    		{
    			playerRedRock = true;
    			playerType1Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 1)
    		{
    			playerBlueRock = true;
    			playerType1Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 1)
    		{
    			playerYellowRock = true;
    			playerType1Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 1)
    		{
    			playerGreenRock = true;
    			playerType1Ctr++;
    		}
    		
    		
    		if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 2) //paper
    		{
    			playerRedPaper = true;
    			playerType2Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 2)
    		{
    			playerBluePaper = true;
    			playerType2Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 2)
    		{
    			playerYellowPaper = true;
    			playerType2Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 2)
    		{
    			playerGreenPaper = true;
    			playerType2Ctr++;
    		}
    		
    		if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 3) //scissors
    		{
    			playerRedScissors = true;
    			playerType3Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 3)
    		{
    			playerBlueScissors = true;
    			playerType3Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 3)
    		{
    			playerYellowScissors = true;
    			playerType3Ctr++;
    		}
    		if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 3)
    		{
    			playerGreenScissors = true;
    			playerType3Ctr++;
    		}
    	}
    	
    	//enemy check
    	for (int ctr1=0; ctr1 < enemyWinCard.length; ctr1++){
    		//type check
    		if (enemyWinCard[ctr1][1] == 1)
    		{
    			enemyType1 = true;
    		}
    		if (enemyWinCard[ctr1][1] == 2)
    		{
    			enemyType2 = true;
    		}
    		if (enemyWinCard[ctr1][1] == 3)
    		{
    			enemyType3 = true;
    		}
    		
    		//color check
    		if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 1) //rocks
    		{
    			enemyRedRock = true;
    			enemyType1Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 1)
    		{
    			enemyBlueRock = true;
    			enemyType1Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 1)
    		{
    			enemyYellowRock = true;
    			enemyType1Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 1)
    		{
    			enemyGreenRock = true;
    			enemyType1Ctr++;
    		}
    		
    		
    		if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 2) //paper
    		{
    			enemyRedPaper = true;
    			enemyType2Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 2)
    		{
    			enemyBluePaper = true;
    			enemyType2Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 2)
    		{
    			enemyYellowPaper = true;
    			enemyType2Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 2)
    		{
    			enemyGreenPaper = true;
    			enemyType2Ctr++;
    		}
    		
    		if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 3) //scissors
    		{
    			enemyRedScissors = true;
    			enemyType3Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 3)
    		{
    			enemyBlueScissors = true;
    			enemyType3Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 3)
    		{
    			enemyYellowScissors = true;
    			enemyType3Ctr++;
    		}
    		if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 3)
    		{
    			enemyGreenScissors = true;
    			enemyType3Ctr++;
    		}
    		
    					   		
    	} //end of this for loop
    	
    	//to check win: 3 of 3 types completed OR 3 of the same type but 3 diff colors
    	//player check
    		if (playerType1 == true && playerType2 == true && playerType3 == true){
    			playerTypeWin = true;
    		}
    	//enemy check	
    		else if (enemyType1 == true && enemyType2 == true && enemyType3 == true){
    			enemyTypeWin = true;
    		}   
    			
    			 
    	//player check				
    		else if (playerType1Ctr >= 3){ //already has 3 rocks, check if different colors
    			if (playerRedRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerBlueRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerYellowRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerGreenRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerColor1Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		else if (playerType2Ctr >= 3){ //already has 3 papers, check if different colors
    			if (playerRedPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerBluePaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerYellowPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerGreenPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerColor2Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		else if (playerType3Ctr >= 3){ //already has 3 scissors, check if different colors
    			if (playerRedScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerBlueScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerYellowScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerGreenScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerColor3Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		//enemy check			
    		else if (enemyType1Ctr >= 3){ //already has 3 rocks, check if different colors
    			if (enemyRedRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyBlueRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyYellowRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyGreenRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyColor1Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    		
    		else if (enemyType2Ctr >= 3){ //already has 3 papers, check if different colors
    			if (enemyRedPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyBluePaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyYellowPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyGreenPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyColor2Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    		
    		else if (enemyType3Ctr >= 3){ //already has 3 scissors, check if different colors
    			if (enemyRedScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyBlueScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyYellowScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyGreenScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyColor3Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    	
    	//TERMINATION OF BOOLEANS/RESETTING OF VALUES FOR NEXT ROUND
    	playerType1Ctr=0; playerType2Ctr=0; playerType3Ctr=0;
    	playerRedRock=false; playerRedPaper=false; playerRedScissors=false;
    	playerBlueRock=false; playerBluePaper=false; playerBlueScissors=false;
    	playerYellowRock=false; playerYellowPaper=false; playerYellowScissors=false;
    	playerGreenRock=false; playerGreenPaper=false; playerGreenScissors=false;
    	playerColor1Ctr=0; playerColor2Ctr=0; playerColor3Ctr=0;
    	playerType1=false; playerType2=false; playerType3=false;
    	
    	    	
    	enemyType1Ctr=0; enemyType2Ctr=0; enemyType3Ctr = 0;
    	enemyType1=false; enemyType2=false; enemyType3=false;
    	enemyRedRock=false; enemyRedPaper=false; enemyRedScissors=false;
    	enemyBlueRock=false; enemyBluePaper=false; enemyBlueScissors=false;
    	enemyYellowRock=false; enemyYellowPaper=false; enemyYellowScissors=false;
    	enemyGreenRock=false; enemyGreenPaper=false; enemyGreenScissors=false;
    	enemyColor1Ctr=0; enemyColor2Ctr=0; enemyColor3Ctr=0;    	    	
    	enemyType1=false; enemyType2=false; enemyType3=false;
    	
    	
		} //END BRACKET FOR 1 ROUND LOOP !!
    	
		
    	//CONDITION FOR WINNING
    	while(playerTypeWin == false && playerColorWin == false && enemyTypeWin == false && enemyColorWin == false);
		
		if (playerTypeWin == true)
		{
			System.out.println("\n\nCONGRATULATIONS!! Player won by ROCK, PAPER, SCISSORS!!");
		}
		else if (enemyTypeWin == true)
		{
			System.out.println("\n\nSORRY!! Enemy won by ROCK, PAPER, SCISSORS!!");
		}
		else if (playerColorWin == true)
		{
			System.out.println("\n\nCONGRATULATIONS!! Player won by using 3 different COLORS!!");
		}
		else if (enemyColorWin == true)
		{
			System.out.println("\n\nSORRY!! Enemy won by using 3 different COLORS!!");
		}
		
    }
}
