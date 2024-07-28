def input_tuple():
    i = True
    while i:
        a = tuple(int(x) for x in input("\nEnter the date like  dd,mm,yyyy eg 19,11,2023:").split(","))
        if a[0] < 32:
            if a[1] < 13:
                if 999 < a[2] < 10000:
                    return a
        else: 
            print("\nEnter correct date")
            i = 0

print("\nFirst Date:")
a = input_tuple()

print("\nSecond Date:")
b = input_tuple()

a = a[2]*365 + a[1]*30 + a[0]
b = b[2]*365 + b[1]*30 + b[0]

print("\nNumber of dates between those dates are: ", abs(a-b))
