package com.android.example.module07_module21_module02_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAB = com.android.example.module07_module21_module02_module1_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAD = com.android.example.module07_module21_module02_module1_module5.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAD = com.android.example.module07_module21_module02_module1_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAA,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-2181177012242583000)

		param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-8062561473942999779)

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.createWorker()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAD
	) {
		val local_var_2_1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(21)
		local_var_2_1.setFirst(kotlin.Any())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAF,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAC
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
