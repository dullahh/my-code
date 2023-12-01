from turtle import *

speed(0)
hideturtle()
penup()

bgcolor("Black")

a = (60/255)

colormode(255)

r = 255
g = 0
b = 0

p = 1

j = 1
k = 255

width(2)





for i in range(5):

    tracer(0,0)

    for i in range(j):

       

        for i in range(k):


            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)

            g += 1

       
       
    for i in range(j):

       

        for i in range(k):

           

            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)

            r -= 1


     

    for i in range(j):

       

        for i in range(k):


            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)

            b += 1

       

    for i in range(j):

       

        for i in range(k):

 

            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)

            g -= 1




    for i in range(j):

       

        for i in range(k):


            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)


            r += 1

 

    for i in range(j):

   

        for i in range(k):

            pencolor(r,g,b)

            rt(a)
            pendown()
            fd(900)
            penup()
            goto(0,0)

            b -= 1

       

    setheading(p)

    p+= 0.1

    update()

mainloop()
