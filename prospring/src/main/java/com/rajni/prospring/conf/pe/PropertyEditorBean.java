package com.rajni.prospring.conf.pe;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

public class PropertyEditorBean {
	private byte[] bytes;
	private Boolean trueOrFalse;
	private Class<?> cls;
	private List<String> stringList;
	private Date date;
	private Float floatValue;
	private File file;
	private InputStream inputStream;
	private Locale locale;
	private Pattern pattern;
	private Properties properties;
	private String trimString;
	private URL url;
	
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public Boolean getTrueOrFalse() {
		return trueOrFalse;
	}
	public void setTrueOrFalse(Boolean trueOrFalse) {
		this.trueOrFalse = trueOrFalse;
	}
	public Class<?> getCls() {
		return cls;
	}
	public void setCls(Class<?> cls) {
		this.cls = cls;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getFloatValue() {
		return floatValue;
	}
	public void setFloatValue(Float floatValue) {
		this.floatValue = floatValue;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getTrimString() {
		return trimString;
	}
	public void setTrimString(String trimString) {
		this.trimString = trimString;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	
}
