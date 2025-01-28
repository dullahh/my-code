import cv2#cv library that allows us to do cv stuff
from PIL import Image
from util import getLimits

yellow = [0, 255, 255]
green = [0, 255, 0]
red = [0, 0, 255]
blue = [255, 0, 0]


cap = cv2.VideoCapture(0)#initialisation to capture a webcam(0 is the original laptop camera)
while True:#infinite while loop to capture camera frames
    ret, frame = cap.read()#ret: boolean to indicate if a frame was sucessfully read
                            #frame: the actual captured frame from the camera
                            #cap.read(): captures a frame from webcam and returns the 2 values^^^

    lLimit, uLimit = getLimits(colour = blue)# swap this colour arguement with any colour on rgb spectrum

    hsvPic = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)#converts captured frames into HSV colour space

    mask = cv2.inRange(hsvPic, lLimit, uLimit)#blackens everything and only whitens yellow objects

    mask_ = Image.fromarray(mask)

    box = mask_.getbbox()# gets the bounding box

    #print(box)

    if box:
        x1, y1, x2, y2 = box

        frame = cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 225, 0), 5)
        # vertices of the rectangular frame capture




    cv2.imshow('frame', frame)# displays the frame in a window
                            #'frame': name of the window
                            #frame: the actual captured frame

    

    if cv2.waitKey(1) and 0xFF == ord('q'):#cv2.waitKey: waits 1ms for a keypress, if no press, it proceeds
                                            #0xFF:ensures value returned from 'waitKey()' is in a universal format
                                            #ord(q): gets ASCII value for q
        break

cap.release()#releases vid capture object
            #necessary flag so that it can indicate other programs can now use the camera

cv2.destroyAllWindows()#terminates all OpenCV windows from 'cv2.imshow()'
                        #ensures no windows remain open after the program