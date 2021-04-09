from pynput.keyboard import Key, Controller, Listener
import time
import PIL
from PIL import ImageGrab

keyboard = Controller()

while True:
    screenshot = ImageGrab.grab(bbox =(990, 200, 1291, 201))
    Lr, Lg, Lb = screenshot.getpixel((35,0))
    Dr, Dg, Db = screenshot.getpixel((120,0))
    Ur, Ug, Ub = screenshot.getpixel((210,0))
    Rr, Rg, Rb = screenshot.getpixel((300,0))

    if Lr==194 and Lg==75 and Lb==153 or Lr==226 and Lg==118 and Lb==255:
                   
        keyboard.release(Key.left)
        keyboard.press(Key.left)
        time.sleep(0.06)
    if Dr==0 and Dg==255 and Db==255 or Dr==61 and Dg==202 and Db==255:
               
        keyboard.release(Key.down)
        keyboard.press(Key.down)
        time.sleep(0.06)
    if Ur==18 and Ug==250 and Ub==5 or Ur==113 and Ug==227 and Ub==0:
        
        keyboard.release(Key.up)
        keyboard.press(Key.up)
        time.sleep(0.06)
    if  Rr==249 and Rg==57 and Rb==63 or Rr==255 and Rg==136 and Rb==78:
        
        keyboard.release(Key.right)
        keyboard.press(Key.right)
        time.sleep(0.06)
