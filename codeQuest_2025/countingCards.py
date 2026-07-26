for i in range(int(input())):
    playerHand = input().split(" ")
    dealerHand = input().split(" ")
    playerScore = 0
    playerAces = 0
    dealerScore = 0
    dealerAces = 0
    key = {
        "2": 2,
        "3": 3,
        "4": 4,
        "5": 5,
        "6": 6,
        "7": 7,
        "8": 8,
        "9": 9,
        "10": 10,
        "JACK": 10,
        "QUEEN": 10,
        "KING": 10,
        "ACE": 11  # Start Aces as 11
    }

    # Calculate player score
    for item in playerHand:
        splitItem = item.split("_")
        card = splitItem[0]
        
        if card == "ACE":
            playerAces += 1
            playerScore += key[card]  # Add Ace as 11
        else:
            playerScore += key[card]
    
    # Adjust for Aces if score exceeds 21
    while playerScore > 21 and playerAces > 0:
        playerScore -= 10  # Adjust one Ace from 11 to 1
        playerAces -= 1

    # Calculate dealer score
    for item in dealerHand:
        splitItem = item.split("_")
        card = splitItem[0]
        
        if card == "ACE":
            dealerAces += 1
            dealerScore += key[card]  # Add Ace as 11
        else:
            dealerScore += key[card]

    # Adjust for Aces if score exceeds 21
    while dealerScore > 21 and dealerAces > 0:
        dealerScore -= 10  # Adjust one Ace from 11 to 1
        dealerAces -= 1

    print("Player Score: " + str(playerScore) + " Dealer Score: " + str(dealerScore), end="")
    
    if playerScore > 21:
        print(" Dealer Wins!")
    elif dealerScore > 21 or playerScore > dealerScore:
        print(" Player Wins!")
    elif dealerScore > playerScore:
        print(" Dealer Wins!")
    else:
        print(" Tie!")