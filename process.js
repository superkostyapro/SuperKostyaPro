const fs = require('fs');
const path = require('path');
const process = require('process');

String.prototype.replaceBetween = function(start, end, what) {
  return this.substring(0, start) + what + this.substring(end);
};

process.chdir('src/Phaser');

fs.readdir('.', (err, files) => {
  files.forEach(file => {
    if (file.startsWith('phaser')) {
      const data = fs.readFileSync(file, 'utf8');
      const start = data.indexOf("package ");
      const end = data.indexOf('\n', start);
      const pckg = data.substring(start, end);
      const result = data.replaceBetween(start, end, pckg.substring(0, pckg.lastIndexOf('.')));
      fs.writeFileSync(file, result, 'utf8');
      let dir = path.dirname(file);
      const parts = file.split('.');
      for (let i = 2; i < parts.length - 2; i++) {
        const part = parts[i];
        if (i === parts.length - 3) {
          fs.copyFileSync(file, `${dir}/${part}.kt`);
        } else {
          dir = `${dir}/${part}`;
          if (!fs.existsSync(dir)) {
            fs.mkdirSync(dir);
          }
        }
      }
    }
  })
})