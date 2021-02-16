import requests

r = requests.get('https://www.reddit.com/r/FUTMobile/')
print(r.text)