yVariables = []
xVariables = []
yRank = []
xRank = []
xyComboSplit = []
yCount = 1
xCount = 0
difOne=[]
difTwo = []
difThree = 0
#i = 0
variableAmount = int(input("How many variables will you be using?"))

for i in range(variableAmount):
    xInput = float(input("What is your x variable input"))
    xVariables.append(xInput)
    xyComboSplit.append(xInput)
    yInput = float(input("What is your y variable following the previous x variable"))
    yVariables.append(yInput)
    xyComboSplit.append(yInput)

xVariables.sort
yVariables.sort



d =(variableAmount) / 2

n = round(d)

for i in range(variableAmount):
    difOne.append(xyComboSplit[xCount])
    difOne.append(xyComboSplit[yCount])
    newOne = difOne[xCount] - difOne[yCount]
    difTwo.append(newOne)
    xCount = xCount + 2
    yCount = yCount + 2

for i in range(variableAmount):
    x = ((difTwo[i]) * (difTwo[i]))
    difThree = difThree + x
    i = i + 1

p = 1 - (((6 * difThree) / variableAmount * ((variableAmount * variableAmount) - 1)))
q = (6 * difThree)
w = ((variableAmount ** 2) - 1)
r = variableAmount * w
e = q / r
p = 1 - e
#print(q)
#print(w)
#print(e)
corro = round(p,2)
print("The corrolation between your set of variables is", corro)
