const gulp = require('gulp');
const jasmine = require('gulp-jasmine');
const jasmineBrowser = require('gulp-jasmine-browser');
const watch = require('gulp-watch');

gulp.task('default', function() {
    return gulp.src('src/test/javascript/**/*.js')
        .pipe(jasmine())
});

gulp.task('jasmine', function() {
    var filesForTest = ['src/test/javascript/**/*.js'];
    var filesToWatch = ['src/main/resources/**/*.js', 'src/test/javascript/**/*.js'];
    return gulp.src(filesForTest)
        .pipe(watch(filesToWatch))
        .pipe(jasmineBrowser.specRunner())
        .pipe(jasmineBrowser.server({port: 8888}));
});
