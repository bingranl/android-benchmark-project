package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module342_module3.ClassAAF = com.android.example.module06_module342_module3.ClassAAF()
		local_var_2_1.method0("SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAC = com.android.example.module06_module321_module10.ClassAAC()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module321_module10.ClassAAC = com.android.example.module06_module321_module10.ClassAAC()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
		local_var_2_5.method4("SomeString", "SomeString", "SomeString")

		param0.dispose()

		val local_var_2_6: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_6.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
