from .models import *
from django import forms
class TestStudentForm(forms.ModelForm):
    class Meta:
        model=TestStudent
        fields='__all__'
    # dateofbirth=forms.CharField(max_length=50,widget=forms.widgets.DateInput(attrs={'type':"date"}))
    # emailid=forms.EmailField(max_length=100)
    def __init__(self,*args,**kwargs):
        super().__init__(*args,**kwargs)
        self.fields['dateofbirth'].widget.attrs['type']='date'
