from django.shortcuts import render
from rest_framework import viewsets
from .models import *
from .serializers import *
from django.http import HttpResponse, JsonResponse
from django.views.decorators.csrf import csrf_exempt
from rest_framework.parsers import JSONParser

# Create your views here.

#These additions break up the single construction into smaller ones.
@csrf_exempt
def rest_req(request):
    if request.method == 'GET':
        rest = Rest.objects.all(rest)
        serializer = restSerializer()
        return JsonResponse(serializer.data, safe=False)
    else:
        return JsonResponse(serializer.errors, status=400)

@csrf_exempt
def rest_req_id(request, id) :
    try:
        rest = rest.objects.get(id=id)

    if request.method == 'GET':
        serializer = restSerializer(snippet)
        return JsonResponse(serializer.data)
    else:
        return JsonResponse(serializer.errors, status=400)

class itemView(viewsets.ModelViewSet):
    queryset = Item.objects.all()
    serializer_class = itemSerializer

class userView(viewsets.ModelViewSet):
    queryset = User.objects.all()
    serializer_class = userSerializer