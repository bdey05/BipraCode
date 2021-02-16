from django.shortcuts import render
from django.http import HttpResponse

posts = [
    {
        'author': 'Bipra Dey',
        'title': 'BlogPost1',
        'content': 'First post content',
        'date_posted': 'August 2, 2018'

    },
     {
        'author': 'Akumpo',
        'title': 'BlogPost2',
        'content': 'Second post content',
        'date_posted': 'August 8, 2018'

    }
]



def home(request):
    context = {
        'posts': posts
    }
    return render(request, 'blog/home.html', context)

def about(request):
    return render(request, 'blog/about.html', {'title': 'About'} )