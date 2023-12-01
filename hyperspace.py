from turtle import *
import random
bgcolor('black')
hideturtle()
width(2)

x = 1
speed(0)

bank = []

c1 = [5,8,11]
c2 = [6,13,19]
c3 = [6,8,11]
c4 = [4,7,10]
c5 = [2,4,7]
c6 = [13,20,27]
c7 = [39,54,69]
c8 = [24,39,54]
c9 = [57,80,102]
c10 = [58,81,101]
c11 = [34,50,63]
c12 = [4,10,14]
c13 = [18,32,46]
c14 = [10,17,24]
c15 = [90,125,158]
c16 = [60,86,112]
c17 = [70,102,129]
c18 = [135,171,199]
c19 = [8,17,26]
c20 = [101,133,159]

for i in range(143):
    bank.append(c1)

for i in range(119):
    bank.append(c2)

for i in range(119):
    bank.append(c3)

for i in range(110):
    bank.append(c4)

for i in range(96):
    bank.append(c5)

for i in range(79):
    bank.append(c6)

for i in range(50):
    bank.append(c7)

for i in range(48):
    bank.append(c8)

for i in range(41):
    bank.append(c9)

for i in range(37):
    bank.append(c10)

for i in range(32):
    bank.append(c11)

for i in range(26):
    bank.append(c12)

for i in range(24):
    bank.append(c13)

for i in range(21):
    bank.append(c14)

for i in range(50):
    bank.append(c15)

for i in range(15):
    bank.append(c16)

for i in range(15):
    bank.append(c17)

for i in range(100):
    bank.append(c18)

for i in range(50):
    bank.append(c19)

for i in range(100):
    bank.append(c20)

tracer(0,0)

for i in range(50):


    for i in range(50):

        marker = random.randint(1,2)

        if marker == 1:

            p = random.randint(0,1022)

            r, g, b = bank[p][0] , bank[p][1] , bank[p][2]
           
            penup()
            setpos(0,0)
            colormode(255)
            pencolor(r,g,b)
            rt(random.randint(0,360))
            fd(random.randint(0, 750))
            pendown()
            fd(random.randint(100,900))

           

        else:

            p = random.randint(0,1022)

            r, g, b = bank[p][0] , bank[p][1] , bank[p][2]
           
            penup()
            setpos(0,0)
            colormode(255)
            pencolor(r,g,b)
            pendown()
            rt(random.randint(0,360))
            fd(random.randint(100,900))

       

update()

mainloop()
