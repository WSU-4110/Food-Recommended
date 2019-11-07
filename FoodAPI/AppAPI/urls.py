from django.urls import path, include
from . import views
from rest_framework import routers

router = routers.DefaultRouter()

#again breaking apart the overly complex router
router.register('Rest', views.rest_req)
router.register('Rest/<int:id>/', views.rest_req_id)

router.register('Item', views.itemView)
router.register('User', views.userView)

urlpatterns = [
    path('', include(router.urls))
]

