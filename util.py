import numpy as np
import cv2

def getLimits(colour):
    c = np.uint8([[colour]])
    hsvC = cv2.cvtColor(c, cv2.COLOR_BGR2HSV)

    lLimit = hsvC[0][0][0] - 10, 100, 100
    uLimit = hsvC[0][0][0] + 10, 255, 255

    lLimit = np.array(lLimit, dtype=np.uint8)
    uLimit = np.array(uLimit, dtype=np.uint8)

    return (lLimit, uLimit)