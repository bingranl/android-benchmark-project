package com.android.example.module06_module002_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		for (iAb in 0..5) {
			param0.get()

			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module282_module1.ClassAAI = com.android.example.module06_module282_module1.ClassAAI()
				local_var_4_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), com.android.example.module06_module342_module3.ClassAAB())

			}
			param0.get()

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAJ = com.android.example.module06_module342_module3.ClassAAJ()
		local_var_2_2.method3("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAB = com.android.example.module06_module337_module3.ClassAAB()
		local_var_2_3.method2(io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
