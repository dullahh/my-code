from turtle import *

speed(0)

y = 420

colormode(255)
hideturtle()

r = 255
g = 0
b = 0

x = 4

tracer(0,0)

for i in range(x):

   

    for i in range(255):

       

        penup()
        goto(-800,y)
        pendown()

        pencolor(r,g,b)

        fd(1600)

        g += 1
        y -= (840/1530)/x

       

    for i in range(255):

     

        penup()
        goto(-800,y)
        pendown()
        pencolor(r,g,b)

        fd(1600)

        r -= 1
        y -= (840/1530)/x

   

    for i in range(255):

 

        penup()
        goto(-800,y)
        pendown()
        pencolor(r,g,b)

        fd(1600)

        b += 1
        y -= (840/1530)/x

   

    for i in range(255):

     

        penup()
        goto(-800,y)
        pendown()
        pencolor(r,g,b)

        fd(1600)

        g -= 1
        y -= (840/1530)/x

   

    for i in range(255):

       

        penup()
        goto(-800,y)
        pendown()
        pencolor(r,g,b)

        fd(1600)

        r += 1
        y -= (840/1530)/x

     

    for i in range(255):

       

        penup()
        goto(-800,y)
        pendown()
        pencolor(r,g,b)

        fd(1600)

        b -= 1
        y -= (840/1530)/x

       

   
update()
mainloop()
