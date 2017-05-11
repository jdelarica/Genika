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

**Figure 1.** *Percentages of the Dlib and App tests.* 			
 
 The system also extracts a [.txt file](https://www.dropbox.com/s/oqz4kxj6oj976oq/landmarks.txt?dl=0) with the landmarks of each point of the face detection. Genika worked on a simple Matlab code studying the way to modify the presentation of these landmarks and make a proper use of them, so later it would be used in the 3D Meshing stage.
 
 ```matlab
 function landmarkplot = landmarkplot2();
filename = fullfile('landmarks.txt');
 fileID = fopen(filename);
 C = textscan(fileID,'%f %s %s','Delimiter','.');
 index = C{1}, landmarks = C{2};
 
 xvector=zeros(68,1);
 yvector=zeros(68,1);
 for i=1:68
 celda=strjoin(landmarks(i,1));
 celda= strrep(celda,'Point(','');
 celda= strrep(celda,')', '' );
 celda = strsplit(celda, ',');
 X = celda{1}, Y = celda{2};
 X = str2num(X);
 Y = str2num(Y);
 xvector(i,1)=X;
 yvector(i,1)=Y;
 end
 scatter(xvector,yvector);
end
```

![68landmarks](/img/landmarks.JPG)

 **Figure 2.** *Landmarks detection and classification.* 
 
 # Stage 3 - 3D Meshing
 
 From the 68 landmarks detected in the images, the team wants to extract these points and place them in a 3D Model in such a way that the image fits into it. The team has designed a 3D model using [Blender](https://www.blender.org/). Blender is an open source 3D creation suite that supports the entirety of the 3D pipeline-modeling, animation and simulation.
 Genika computed an Android Application which shows the 3D model and it allows to load the images into the model.
 
 # Stage 4 - Integration
 
 
