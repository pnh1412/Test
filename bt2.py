
import csv
import pandas
from pandas import DataFrame
filegame = pandas.read_csv("filegame_2.csv", keep_default_na=False)

lstgame = []
index = 0 #cot trong 1 dong 
line = 0  #dong trong file 
with open("filegame_1.csv","r") as filegame:
        rs = csv.reader(filegame)
        for row in rs:
            if line == 0:
                print(f'ten cac cot: {",".join(row)}')
                line +=1
            else:
                lstgame.append(row)
        filegame.close()
        print(lstgame)
print("Hoan thanh viec tao list")
for row in range(len(lstgame)):
    if(lstgame[line][1]== ''): #cot nam phat hanh
            lstgame[line][1] = 'PC'
    if(lstgame[line][2] == ''):
            lstgame[line][2] == "2013"
    if(lstgame[line][3] == ''):
            lstgame[line][3] == 'Shooter'
    if(lstgame[line][4] == ''):
            lstgame[line][4] == '0.02'
print("Da sua loi xong")
df = DataFrame(lstgame,columns=['Name','Platform','Year','Genre','Global_Sales'])
rs = df.to_csv("filegame_2.csv",index="None",header=True)
print("Ghi file thanh cong")
filegame = pandas.read_csv("filegame_2.csv")        
print(filegame)
