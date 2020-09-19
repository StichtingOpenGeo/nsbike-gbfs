# NSBike to GBFS

Transform NSBike data into GBFS. 

## Installation
1. Install universal https://github.com/StichtingOpenGeo/universal
2. Install Java 11
3. Create the user universal via: `useradd universal -d /var/empty -s /usr/bin/nologin`
4. Create the user nsbike via: `useradd nsbike -d /home/projects/gbfs.openov.org/src/nsbike-gbfs -s /usr/bin/nologin`
5. Install the systemd service files for universal-nsbike and nsbike-gbfs, enable and start them.
