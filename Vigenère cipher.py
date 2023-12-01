
#WILL FINISH THE DECRYPTION MECHANICS SOON!!!



encryptionTemplate = []
n = 0
k = 0
l = 0
a = 0
b = 0
encryptedMessage = []
listxAxis = []
listyAxis = []
alphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
def vCipher():
    print("    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z")
    print(" ______________________________________________________")
    print("A|  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z")
    print("B|  B C D E F G H I J K L M N O P Q R S T U V W X Y Z A")
    print("C|  C D E F G H I J K L M N O P Q R S T U V W X Y Z A B")
    print("D|  D E F G H I J K L M N O P Q R S T U V W X Y Z A B C")
    print("E|  E F G H I J K L M N O P Q R S T U V W X Y Z A B C D")
    print("F|  F G H I J K L M N O P Q R S T U V W X Y Z A B C D E")
    print("G|  G H I J K L M N O P Q R S T U V W X Y Z A B C D E F")
    print("H|  H I J K L M N O P Q R S T U V W X Y Z A B C D E F G")
    print("I|  I J K L M N O P Q R S T U V W X Y Z A B C D E F G H")
    print("J|  J K L M N O P Q R S T U V W X Y Z A B C D E F G H I")
    print("K|  K L M N O P Q R S T U V W X Y Z A B C D E F G H I J")
    print("L|  L M N O P Q R S T U V W X Y Z A B C D E F G H I J K")
    print("M|  M N O P Q R S T U V W X Y Z A B C D E F G H I J K L")
    print("N|  N O P Q R S T U V W X Y Z A B C D E F G H I J K L M")
    print("O|  O P Q R S T U V W X Y Z A B C D E F G H I J K L M N")
    print("P|  P Q R S T U V W X Y Z A B C D E F G H I J K L M N O")
    print("Q|  Q R S T U V W X Y Z A B C D E F G H I J K L M N O P")
    print("R|  R S T U V W X Y Z A B C D E F G H I J K L M N O P Q")
    print("S|  S T U V W X Y Z A B C D E F G H I J K L M N O P Q R")
    print("T|  T U V W X Y Z A B C D E F G H I J K L M N O P Q R S")
    print("U|  U V W X Y Z A B C D E F G H I J K L M N O P Q R S T")
    print("V|  V W X Y Z A B C D E F G H I J K L M N O P Q R S T U")
    print("W|  W X Y Z A B C D E F G H I J K L M N O P Q R S T U V")
    print("X|  X Y Z A B C D E F G H I J K L M N O P Q R S T U V W")
    print("Y|  Y Z A B C D E F G H I J K L M N O P Q R S T U V W X")
    print("Z|  Z A B C D E F G H I J K L M N O P Q R S T U V W X Y")
vCipher()

vCipher = [["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"],
           ["B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"],
           ["C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"],
           ["D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"],
           ["E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"],
           ["F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"],
           ["G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"],
           ["H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"],
           ["I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"],
           ["J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"],
           ["K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"],
           ["L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"],
           ["M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"],
           ["N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"],
           ["O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"],
           ["P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"],
           ["Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"],
           ["R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"],
           ["S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"],
           ["T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"],
           ["U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"],
           ["V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"],
           ["W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"],
           ["X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"],
           ["Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"],
           ["Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"],
          ]

#print(vCipher)

encryptionKey = str(input("Enter your encryption key"))
splitKey = [i for i in encryptionKey]
#print(splitKey)

# this is what the encryption will infer from on the x axis
encryptionInput = str(input("Enter your message"))
for i in range (len(encryptionInput)):
    encryptionTemplate.append(splitKey[n])
    n = n + 1
    if n == len(splitKey):
        n = 0

print(encryptionTemplate)


message = [i for i in encryptionInput]
#print(message)


rangey = int(len(encryptionTemplate))
#print(rangey)
#for x axis
while (len(listxAxis)) != (rangey):
    if encryptionTemplate[k] == alphabet[l]:
        listxAxis.append(l)
        k = k + 1
        l = 0
    else:
        l = l + 1

#for y axis
while (len(listyAxis)) != (rangey):
    if message[a] == alphabet[b]:
        listyAxis.append(b)
        a = a + 1
        b = 0
    else:
        b = b + 1
    

#print(listxAxis)
#print(listyAxis)


    

for i in range (len(encryptionInput)):
    encryptedMessage.append(vCipher[listxAxis[i]][listyAxis[i]])

print(encryptedMessage)
result = ""
for i in encryptedMessage:
    result += '' + i

print(result)
print(vCipher.index(["K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"]))



