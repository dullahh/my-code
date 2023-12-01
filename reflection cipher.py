
#WILL FINISH THE DECRYPTION MECHANICS SOON!!!

alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "]
Calphabet =["A", "B", "C", "D", "E" "F", "H", "I", "J", "K", "L", "M" ,"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
space = ''
spaced = ''
def encryption(X):
    d = 0
    c = 0
    while len(newMessage) != letterCount:
        currentLetter = splitMessage[(c)]
        if currentLetter == alphabet[d]:
            newMessage.append(reversedAlphabet[d])
            d = d * 0
            c = c + 1
        elif currentLetter != alphabet[d]:
            d = d + 1

        else:
            d = d + 1
            c = c + 1

    
def decryption(y):
    dKey = str(input("Enter the password to use enctryption key"))
    if dKey == "Da key":
        n = 0
        m = 0
        while len(newerMessage) != letterCount:
            currentLetter = newMessage[(n)]
            if currentLetter == reversedAlphabet[m]:
                newerMessage.append(alphabet[m])
                m = m * 0
                n = n + 1
            elif currentLetter != reversedAlphabet[m]:
                m = m + 1

            else:
                m = m + 1
                n = n + 1
        

    
reversedAlphabet = alphabet[::-1]
print(reversedAlphabet)
newMessage = []
newerMessage = []
i = 0

encryptionInput = str(input("enter the message for encryption"))
splitMessage = list(encryptionInput)
letterCount = len(splitMessage)

encryption(newMessage)
decryption(newerMessage)


newestMessage = space.join(newMessage)
newersMessage = spaced.join(newerMessage)
print(newestMessage)
print(newersMessage)


