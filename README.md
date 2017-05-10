# Project Work Genika

This is the project repository for Genika. The Team is made up by:

| ![Carla Brugulat](/img/Carla.JPG) | ![Javier de la Rica](/img/Javier.JPG) | ![Montse Sanahuja](/img/Montse.JPG) | ![Joan Sansa](/img/Joan.JPG) | ![Christian Segovia](/img/Christian.JPG) | ![Alex Kim](/img/Alex.JPG) | ![Chao-Feng Wang](/img/Chao.JPG) |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Carla Brugulat | Javier de la Rica | Montse Sanahuja | Joan Sansa | Christian Segovia | Alex Kim | Chao-Feng Wang |

It is going to be explained below what [Genika](http://genikateam.weebly.com) has been done during the PAE course at UPC at Spring 2017.

![Universitat Politècnica de Catalunya](/img/upc_etsetb.jpg)

 The main aim of the current project is to achieve a real time facial detection in order to create a personalized  avatar the user would be able to play with.
 
 # Stage 1 - Android
 
 The team computed an Android Application that has access to the main and the frontal camera. The App has also a GET AVATAR button, which takes a picture and saves it, so later it computes the avatar and shows it on the device's screen.
 The team has also computed the main page of the Android Application with a simple Login page, a button tu directly open the frontal camera and a link to Genika's website with the logo.
 
 # Stage 2 - Face Detection
 
 Genika has been able to execute the [Dlib C++ library](http://dlib.net). Dlib is a C++ toolkit containing machine learning algorithms complex software. The team used it to detect the user's face, and observed that it detects different faces in a single image in a prevcise way. Furthermore, Genika has tried several images with different characteristics in order to see the strength of the algorithm, studying at the same time the Dlib code.
 The system detects the faces even if they are dark, and even if the person wars glasses or the picture is blurry or Black and White.
	
### Results
					From 92 desirable faces to detect:
						- 80 faces detected.
						- 12 faces not detected.
  
					    | ACCURACY = 80/92 = 86.95% |
![Perc](/img/perc.JPG)				
			
 
 The system also extracts a [.txt file](https://www.dropbox.com/s/oqz4kxj6oj976oq/landmarks.txt?dl=0) with the landmarks of each point of the face detection. Genika worked on a simple Matlab code studying the way to modify the presentation of these landmarks and make a proper use of them, so later it would be used in the 3D Meshing stage.
 
 # Stage 3 - 3D Meshing
 
 
 
 
