from turtle import *

def graph(x_inc,y_inc):
   
    speed(0)

    penup()
    setpos(-400,400)
    setheading(270)
    pendown()
    fd(800)
    lt(90)
    fd(800)
    penup()

    y = -400

    for i in range(int(max(numset) + 1)):
       
        setpos(-400,y)
        setheading(180)
        pendown()
        fd(10)
        penup()

        y = y + y_inc

    x = -400

    for i in range(int(len(numset))):

        setpos(x,-400)
        setheading(270)
        pendown()
        fd(10)
        penup()

        x = x + x_inc


num = int(input("Enter number: "))

numset = []

while num != 1:

    numset.append(num)

    if num % 2 == 0:

        num = num / 2

    else:

        num = 3 * num + 1

numset.append(1)



print(numset)

x_inc = 800 / (len(numset) - 1)

y_inc = 800 / max(numset)

shape("circle")
shapesize(0.25,0.25,0.25)

hideturtle()

tracer(0,0)

graph(x_inc,y_inc)

penup()

goto(-400,-400)

setheading(90)

x = -400

pendown()

for i in range(len(numset)):

    y = (numset[i] * y_inc) - 400

    goto(x,y)
    stamp()

    x = x + x_inc

update()

mainloop()
