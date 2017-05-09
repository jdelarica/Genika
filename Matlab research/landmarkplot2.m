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