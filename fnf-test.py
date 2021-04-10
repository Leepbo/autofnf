from pynput.keyboard import Key, Controller, Listener
import time
import PIL
from PIL import ImageGrab

keyboard = Controller()

while True:
    screenshot = ImageGrab.grab(bbox=(990, 200, 1291, 201))
    L = screenshot.getpixel((35, 0))
    D = screenshot.getpixel((120, 0))
    U = screenshot.getpixel((210, 0))
    R = screenshot.getpixel((300, 0))

    L_Color = 194, 75, 153
    L_Alt_Color = 226, 118, 255
    D_Color = 0, 255, 255
    D_Alt_Color = 61, 202, 255
    U_Color = 18, 250, 5
    U_Alt_Color = 113, 227, 0
    R_Color = 249, 57, 63
    R_Alt_Color = 255, 136, 78

    # Double Keys
    if L == L_Color and D == D_Color:

        print("LD")

        keyboard.release(Key.left)
        keyboard.press(Key.left)
        keyboard.release(Key.down)
        keyboard.press(Key.down)
        continue
        time.sleep(0.055)

    if D == D_Color and U == U_Color:

        print("DU")

        keyboard.release(Key.down)
        keyboard.press(Key.down)
        keyboard.release(Key.up)
        keyboard.press(Key.up)
        continue
        time.sleep(0.055)

    if U == U_Color and R == R_Color:

        print("UR")

        keyboard.release(Key.up)
        keyboard.press(Key.up)
        keyboard.release(Key.right)
        keyboard.press(Key.right)
        continue
        time.sleep(0.055)

    if D == D_Color and R == R_Color:

        print("DR")

        keyboard.release(Key.down)
        keyboard.press(Key.down)
        keyboard.release(Key.right)
        keyboard.press(Key.right)
        continue
        time.sleep(0.055)

    if U == U_Color and L == L_Color:

        print("UL")

        keyboard.release(Key.up)
        keyboard.press(Key.up)
        keyboard.release(Key.left)
        keyboard.press(Key.left)
        continue
        time.sleep(0.055)

    if R == R_Color and L == L_Color:

        print("RL")

        keyboard.release(Key.right)
        keyboard.press(Key.right)
        keyboard.release(Key.left)
        keyboard.press(Key.left)
        continue
        time.sleep(0.055)

    # Single keys

    if L == L_Color or L == L_Alt_Color:

        keyboard.release(Key.left)
        keyboard.press(Key.left)
        continue
        time.sleep(0.055)
    if D == D_Color or D == D_Alt_Color:

        keyboard.release(Key.down)
        keyboard.press(Key.down)
        continue
        time.sleep(0.055)
    if U == U_Color or U == U_Alt_Color:

        keyboard.release(Key.up)
        keyboard.press(Key.up)
        continue
        time.sleep(0.055)
    if R == R_Color or R == R_Alt_Color:

        keyboard.release(Key.right)
        keyboard.press(Key.right)
        continue
        time.sleep(0.055)
